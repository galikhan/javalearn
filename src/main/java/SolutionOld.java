import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


//Roads and Libraries
public class SolutionOld {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();


        long clib = 0;
        long croad = 0;
        for (int a0 = 0; a0 < q; a0++) {

            Map<Integer, List<Cords>> map = new HashMap<>();
            int cities = in.nextInt();
            int roads = in.nextInt();
            clib = in.nextLong();
            croad = in.nextLong();

            if(roads > 0) {


                List<Cords> globalList = new ArrayList<>();
                for (int a1 = 0; a1 < roads; a1++) {

                    int city_1 = in.nextInt();
                    int city_2 = in.nextInt();

                    globalList.add(new Cords(city_1, city_2));
                }

                Map<Integer, Integer>  cityCount = new HashMap<>();
                int totalConnectedCity = 0;






                //counter map
                int mapKey = 0;
                Map<Integer, List<Cords>> citySetMap = new HashMap<>();

                while(globalList.size() > 0) {
                    Cords cords = globalList.get(0);
                    globalList.remove(0);
                    cityRecur(cords, mapKey, globalList, citySetMap);
                    mapKey++;
                }


                for(Map.Entry<Integer, List<Cords>> entry:citySetMap.entrySet()) {
                    Set<Integer> set = new HashSet<>();
                    for(Cords cords:entry.getValue()) {
                        set.add(cords.getX());
                        set.add(cords.getY());
                    }
                    cityCount.put(entry.getKey(), set.size());
                    totalConnectedCity += set.size();
                }


                int otherCityCount = 0;
                if(cities > totalConnectedCity) {
                    otherCityCount = cities - totalConnectedCity;
                }
                int totalSum = (int) (otherCityCount * clib);


                for(Map.Entry<Integer, Integer> entry:cityCount.entrySet()) {
                    if((entry.getValue()-1) * croad + clib <= (entry.getValue() * clib)) {
                        totalSum += (entry.getValue()-1) * croad+clib;
                    } else {
                        totalSum += entry.getValue() * clib;
                    }
                }
                System.out.println(totalSum);
            } else {
                System.out.println(clib * cities);
            }

        }
    }

    public static void cityRecur(Cords cords, int mapKey, List<Cords> list, Map<Integer, List<Cords>> cityGroup) {
        boolean notExist = false;
        for (int i = 0; i < list.size() ; i++) {
            Cords subCords = list.get(i);
            if(cords.getX() == subCords.getX()
                    || cords.getX() == subCords.getY()
                    || cords.getY() == subCords.getX()
                    || cords.getY() == subCords.getY()) {

                list.remove(i);
                List<Cords> cordsList;
                if(cityGroup.get(mapKey) !=null) {
                    cityGroup.get(mapKey).add(subCords);
                } else {
                    cordsList = new ArrayList<>();
                    cordsList.add(subCords);
                }

                notExist = false;
                cityRecur(subCords, mapKey, list, cityGroup);
            } else {
                notExist = true;
            }
        }

        if(notExist) {
            if(cityGroup.get(mapKey) != null) {
                List<Cords> cordsList = cityGroup.get(mapKey);
                cordsList.add(cords);
            } else {
                List<Cords> cordsList = new ArrayList<>();
                cordsList.add(cords);
                cityGroup.put(mapKey, cordsList);
            }
        }

        if(list.size() == 0) {
            if(cityGroup.get(mapKey) != null) {
                List<Cords> cordsList = cityGroup.get(mapKey);
                cordsList.add(cords);
            } else {
                List<Cords> cordsList = new ArrayList<>();
                cordsList.add(cords);
                cityGroup.put(mapKey, cordsList);
            }
        }
    }
}

class Cords{

    public int x;
    public int y;

    public Cords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
