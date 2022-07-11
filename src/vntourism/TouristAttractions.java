package vntourism;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.apache.jena.graph.Node;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.RDFVisitor;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.riot.RDFDataMgr;

public class TouristAttractions {
	private Model model;
	private String pathname;
	private String name;
	String lang;

	// Predefined values are "RDF/XML", "RDF/XML-ABBREV", "N-TRIPLE", "TURTLE", (and
	// "TTL") and "N3".
	// The default value, represented by null, is "RDF/XML".
	public TouristAttractions(String pathname) {
		this.pathname = pathname;
		this.model = ModelFactory.createDefaultModel();
		File myFile = new File(pathname);
		if (!(myFile.exists())) {
			System.out.println("Cannot find path to file");
		} else {
			this.model.read(pathname);
		}
		extractPathname();
	}

	// getters
	public String getName() {
		return name;
	}

	public Model getModel() {
		return model;
	}

	public String getPathname() {
		return pathname;
	}

	// methods
	public void addPrefix(String key, String value) {
		// example: key = "dbo:", value = "http://dbpedia.org/ontology/"
		if (this.model.getNsPrefixMap().containsKey(key)) {
			System.out.println("The prefix key has already been in the model!");
		} else {
			this.model.setNsPrefix(key, value);
			System.out.println("Successfully adding prefix: " + this.model.getNsPrefixMap());
		}
	}

	public void addStatement(String s, String p, String o) {
		// object has 2 types
		// if object isInstanceOf Literal class, then o = "/"value/""
		// if object isInstanceOf RDFNode class, then o = "prefix:value"

		// split string s
		String[] s_tokens = s.split(":");
		Resource subject;
		Property predicate;
		Literal objectLiteral;
		Statement stmt;
		RDFNode object;

		if (s_tokens.length == 2) {
			// s has type = prefix:value
			String ns_s_prefix = s_tokens[0];
			String ns_s_value = s_tokens[1];
			if (this.model.getNsPrefixMap().containsKey(ns_s_prefix)) {
				subject = this.model.createResource(this.model.getNsPrefixURI(ns_s_prefix) + ns_s_value);
			} else {
				subject = this.model.createResource(s);
			}
		} else {
			subject = this.model.createResource(s);
		}

		// split string p
		String[] p_tokens = p.split(":");
		if (p_tokens.length == 2) {
			// s has type = prefix:value
			String ns_p_prefix = p_tokens[0];
			String ns_p_value = p_tokens[1];
			if (this.model.getNsPrefixMap().containsKey(ns_p_prefix)) {
				predicate = this.model.createProperty(this.model.getNsPrefixURI(ns_p_prefix) + ns_p_value);
			} else {
				predicate = this.model.createProperty(p);
			}
		} else {
			predicate = this.model.createProperty(p);
		}

		// split string o
		if (o.contains("\"")) {
			String[] o_tokens = o.split("\"");
			String value = o_tokens[1];
			// o is Literal
			objectLiteral = model.createLiteral(value);
			// make statement
			stmt = this.model.createStatement(subject, predicate, objectLiteral);

		} else {
			// RDFNode object = model.createResource(o);
			// split string o

			String[] o_tokens = o.split(":");
			if (o_tokens.length == 2) {
				// s has type = prefix:value
				String ns_o_prefix = o_tokens[0];
				String ns_o_value = o_tokens[1];
				if (this.model.getNsPrefixMap().containsKey(ns_o_prefix)) {
					object = this.model.createResource(this.model.getNsPrefixURI(ns_o_prefix) + ns_o_value);
				} else {
					object = this.model.createResource(o);
				}
			} else {
				object = this.model.createResource(o);
			}
			stmt = this.model.createStatement(subject, predicate, object);
		}

		// add statement
		this.model.add(stmt);
	}

	public void display(String lang) {
		this.lang = lang;
		this.model.write(System.out, lang);

	}

	public void display1(String lang) {
		this.lang = lang;
		try {
			String currentPath = new java.io.File(".").getCanonicalPath();
			Writer out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(currentPath + "/cache/cache.txt"), "UTF-8"));
			this.model.write(out, lang);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void exportToFile(String filepath) {
		File myObj = new File(filepath);
		try {
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}

			OutputStream myWriter = new FileOutputStream(myObj);
			this.model.write(myWriter, filepath, this.lang);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void exportToFile(String filepath, String lang) {
		this.lang = lang;
		exportToFile(filepath);
	}

	public void extractPathname() {
		String[] pathname_tokens = pathname.split("\\.");
		String[] temp = pathname_tokens[0].split("\\\\");
		this.name = temp[temp.length - 1];
	}

}
