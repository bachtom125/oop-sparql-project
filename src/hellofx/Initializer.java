package hellofx;

import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

import vntourism.Beaches;
import vntourism.HeritageSites;
import vntourism.Lakes;
import vntourism.Museums;
import vntourism.NationalParks;
import vntourism.Temples;

public class Initializer {
    public ArrayList<Lakes> lakeArr = new ArrayList<>();
    public ArrayList<NationalParks> nationalParkArr = new ArrayList<>();
    public ArrayList<Beaches> beachArr = new ArrayList<>();
    public ArrayList<HeritageSites> heritageSiteArr = new ArrayList<>();
    public ArrayList<Museums> museumArr = new ArrayList<>();
    public ArrayList<Temples> templeArr = new ArrayList<>();

    public Initializer() {
        try {
            String currentPath = new java.io.File(".").getCanonicalPath();
            File dir1 = new File(currentPath + "\\QueriedFiles\\LakesofVietnam");

            System.out.println(currentPath + "\\QueriedFiles\\LakesofVietnam\n");
            File[] directoryListing1 = dir1.listFiles();
            if (directoryListing1 != null) {
                for (File child : directoryListing1) {
                    Lakes lake = new Lakes(child.getAbsolutePath());
                    lakeArr.add(lake);
                }
            }

            File dir2 = new File(currentPath + "\\QueriedFiles\\NationalparksofVietnam");
            File[] directoryListing2 = dir2.listFiles();
            if (directoryListing2 != null) {
                for (File child : directoryListing2) {
                    NationalParks nationalPark = new NationalParks(child.getAbsolutePath());
                    nationalParkArr.add(nationalPark);
                }
            }
            File dir3 = new File(currentPath + "\\QueriedFiles\\BeachesofVietnam");
            File[] directoryListing3 = dir3.listFiles();
            if (directoryListing3 != null) {
                for (File child : directoryListing3) {
                    Beaches beach = new Beaches(child.getAbsolutePath());
                    beachArr.add(beach);
                }
            }

            File dir4 = new File(currentPath + "\\QueriedFiles\\WorldHeritageSitesinVietnam");
            File[] directoryListing4 = dir4.listFiles();
            if (directoryListing4 != null) {
                for (File child : directoryListing4) {
                    HeritageSites site = new HeritageSites(child.getAbsolutePath());
                    heritageSiteArr.add(site);
                }
            }

            File dir5 = new File(currentPath + "\\QueriedFiles\\MuseumsinVietnam");
            File[] directoryListing5 = dir5.listFiles();
            if (directoryListing5 != null) {
                for (File child : directoryListing5) {
                    Museums museum = new Museums(child.getAbsolutePath());
                    museumArr.add(museum);
                }
            }
            File dir6 = new File(currentPath + "\\QueriedFiles\\TemplesinVietnam");
            File[] directoryListing6 = dir6.listFiles();
            if (directoryListing6 != null) {
                for (File child : directoryListing6) {
                    Temples temple = new Temples(child.getAbsolutePath());
                    templeArr.add(temple);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // //Initialize some Museums
        // Museum museum1 = new Museum("Ly_Thai_To", "This is the abstract", 2010);
        // Museum museum2 = new Museum("Chuong_Trinh", "haha", 1908);
        // Museum museum3 = new Museum("Nhi_Ngố", "nymoi", 2022);
        // museumArr.add(museum1);
        // museumArr.add(museum2);
        // museumArr.add(museum3);

        // //Initialize some Parks
        // Parks park1 = new Parks("Sun_World", "This is Sun_World", 1998);
        // Parks park2 = new Parks("Cuc_Phuong_National_Park", "This is Cuc Phuong",
        // 1994);
        // Parks park3 = new Parks("Thien_Duong_Bao_Son", "This is Thien Duong Bao Son",
        // 2000);
        // parkArr.add(park1);
        // parkArr.add(park2);
        // parkArr.add(park3);

        // //Initialize some Lakes
        // Lakes lake1 = new Lakes("Hoan_Kiem", "This is ho Hoan Kiem", 1000);
        // Lakes lake2 = new Lakes("Ba_Be", "This is Ba Be Lake", 1800);
        // Lakes lake3 = new Lakes("Ho_Tey", "This is ho Tey", 1876);
        // lakeArr.add(lake1);
        // lakeArr.add(lake2);
        // lakeArr.add(lake3);

    }
}
