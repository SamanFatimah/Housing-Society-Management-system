public class PlotDemo {
    public static void main(String[] args) {
   

        // 1️⃣ Rectangle plot
        Plot p1 = new Plot("A1", PlotType.RES_5_MARLA, true, "RECTANGLE");
        p1.calc_rect(40, 50); // width, depth

        // 2️⃣ Trapezoid plot
        Plot p2 = new Plot("B2", PlotType.RES_10_MARLA, false, "TRAPEZOID");
        p2.calc_trape(35, 50, 40); // front, back, depth
		
        // 3️⃣ L-shaped plot
        Plot p3 = new Plot("C3", PlotType.COMM_SHOP, true, "L_SHAPE");
        p3.calc_Lshape(30, 20, 15, 10); // width1, depth1, width2, depth2
		//Corner Plot
		CornerPlot cp = new CornerPlot("CP1",PlotType.RES_10_MARLA,true,"RECTANGLE");
		cp.calc_Lshape(35,50,40);
        // Print all details
        System.out.println("--- Plot Details ---");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
		System.out.println(cp);
		 }
}
