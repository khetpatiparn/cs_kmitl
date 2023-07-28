public class Lab4Q3660253 {
    public static void main(String[] args) {
        int hrs = 0;
        for (int i = 0; i < args.length; i++){
            hrs = Integer.parseInt(args[i]);
            int add_fare = 0;
            int init_fare = 0;
            int total_fare = 0;
            for (int rnd = 0; rnd <= hrs; rnd++){
                if (rnd <= 2){
                    init_fare = 4;
                }else if (rnd == 3 || rnd == 4){
                    add_fare += 3;
                }else if ((rnd >= 5 && rnd <=18) || (rnd > 24)){
                    add_fare += 1;
                }else {
                    add_fare += 0;
                }
            }
            if (hrs > 24){
                total_fare = (init_fare * 2) + add_fare;
            }else{
                total_fare = init_fare + add_fare;
            }
            System.out.println("parking for " + hrs + " hrs, pay " + total_fare + " baht.");
        }
    }
}