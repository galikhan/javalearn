/**
 * Created by gali on 8/18/17.
 */
public class Candies {

    public int [] countCandy( int arr []) {

        int candies [] = new int[arr.length];

        int i = 0;

        boolean fall = true;
        boolean rise = true;


        //identify if graphic is falling or rising
        if(arr[i] > arr[i + 1]) {
            fall = true;
            rise = false;
        } else if(arr[i] == arr[i + 1]) {
            fall = false;
            rise = false;
        } else if(arr[i] < arr[i + 1]) {
            fall = false;
            rise = true;
        }

        //id of element which changes graphic from falling to rise or vice versa
        int criticalPoint = 0;
        int steps = 1;
        int lastIndex = arr.length - 1;
        while(i < arr.length) {

            //5,4,3,2,1
            //5,4,3,2,1,4
            //5,4,3,2,1,1,4
            //5,4,3,2,1,1,4,3,2,1
            System.out.println("i = " + i);
            if(i == lastIndex) {

                if(rise) {

                    System.out.println("last rise = cp " + criticalPoint + " - sp " + steps);
                    int lastCandyCount = candies[criticalPoint];
                    System.out.println("lastCandyCount = "+lastCandyCount);

                    steps = lastCandyCount + steps;
                    for (int k = i; k >= criticalPoint ; k--) {
                        candies[k] = steps;
                        steps = steps - 1;
                    }

                } else if(fall) {

                    System.out.println("last fall  = cp " + criticalPoint + " - sp " + steps);
                    if(criticalPoint > 0) {
                        criticalPoint = criticalPoint+1;
                    }
                    for (int k = criticalPoint; k < arr.length ; k++) {
                        candies[k] = steps;
                        steps = steps - 1;
                    }


                } else {

                }

            } else {
                //we are falling
                if(arr[i] > arr[i + 1]) {

                    //5,4,3,2,1,3,5,4,3,2,1
                    //5,4,3,2,1,2,5,4,3,2,1
                    if(rise) {

                        int futureStep = 1;
                        int futureK = i;
                        while ((futureK < arr.length -1) && arr[futureK] > arr[futureK+1]) {
                            futureStep = futureStep + 1;
                            futureK = futureK + 1;
                        }
                        System.out.println("futureStep = "+futureStep);

                        System.out.println("rise = cp " + criticalPoint + " - sp " + steps);
                        int lastCandyCount = candies[criticalPoint];
//                        steps = lastCandyCount + steps;

                        System.out.println("lastCandyCount = "+lastCandyCount+" i = "+i);
                        for (int k = i; k >= criticalPoint ; k--) {

                            System.out.println("i = "+i + " i - criticalPoint " + (i - criticalPoint));
                            if(k == i && steps < futureStep) {
                                System.out.println("------------");
                                candies[k] = futureStep;
                                futureStep = futureStep - steps;
                            } else {
                                candies[k] = steps;
                                steps = steps - 1;
                            }
//                            if(steps )
                        }
                        steps = 0;
                        criticalPoint = i;
                    }

                    steps = steps + 1;

                    fall = true;
                    rise = false;

                } else if(arr[i] == arr[i + 1]) {
                    //do nothing
//                    steps = steps + 1;

                } else if(arr[i] < arr[i + 1]) {

                    if(fall) {

                        System.out.println("fall = cp " + criticalPoint + " - sp " + steps);
                        if(criticalPoint > 0) {
                            criticalPoint = criticalPoint + 1;
                        }
//                        for (int k = criticalPoint; k <= i ; k++) {
                        for (int k = criticalPoint; k <= i ; k++) {
                            candies[k] = steps;
                            steps = steps - 1;
                        }

                        steps = 0;
                        criticalPoint = i;

                    }

                    steps = steps + 1;

                    fall = false;
                    rise = true;
                }
            }
            i = i + 1;
        }
        System.out.println("criticalPoint : " + criticalPoint);
        return candies;
    }


    public void print(int arr []) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public void af(int [] arr, int [] candies, int maxVal, int start, int end) {
        for (int i = start; i < end ; i++) {
            candies[i] = maxVal;
        }
    }
}

