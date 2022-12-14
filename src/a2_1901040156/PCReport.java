package a2_1901040156;
import java.util.Vector;

/**
 * @overview Displays a text-based tabular report on some {@link PC} objects.
 */
public class PCReport {
    /**
     * @effects
     *      <pre>
     *          --------------------------------------------------------------------------------
     *                                          PCPROG REPORT
     *          --------------------------------------------------------------------------------
     *          1 Thinkpad X1 Carbon 2022 Lenovo [AMD Ryzen 5, 8GB DDR4, 512GB SSD, NVIDIA MX450]
     *          --------------------------------------------------------------------------------
     *      </pre>
     */
    public String displayReport(PC[] pcs) {
        int col1 = 3, col2 = 20, col3 = 6, col4 = 20, col5 = 50;
        int Lines = col1 + col2 + col3 + col4 + col5 + 4;
        String dashLine = ("-------------------------------------------------------------------------------------------------------\n");
        String header = ("PCPROG REPORT");
        String report = String.format("%" + (int) (0.5 * (Lines + header.length())) + "s \n", header);

        StringBuilder s = new StringBuilder();
        s.append(dashLine);
        s.append(report);
        s.append(dashLine);

        for (int i = 0; i < pcs.length; i++) {
            Set<String> comps = pcs[i].getComps();
            Vector<String> compsStr = comps.getElements();

            String rpt = String.format("%3s %20s %6d %20s %50s \n", (i + 1), pcs[i].getModel(),
                                       pcs[i].getYear(), pcs[i].getManufacture(), compsStr.toString());
            s.append(rpt);
        }
        s.append(dashLine);

        System.out.println(s);
        return report;
    }
}
