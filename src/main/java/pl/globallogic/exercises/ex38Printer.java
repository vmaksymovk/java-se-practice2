package pl.globallogic.exercises;

public class ex38Printer {
        private int tonerLevel;
        private int pagesPrinted;
        private boolean duplex;

        public ex38Printer(int tonerLevel, boolean duplex) {
            if (tonerLevel >= 0 && tonerLevel <= 100) {
                this.tonerLevel = tonerLevel;
            } else {
                this.tonerLevel = -1;
            }
            this.duplex = duplex;
            this.pagesPrinted = 0;
        }

        public int addToner(int tonerAmount) {
            if (tonerAmount > 0 && tonerAmount <= 100) {
                if (this.tonerLevel + tonerAmount > 100) {
                    return -1; // Adding toner would exceed maximum toner level.
                }
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            } else {
                return -1; // Invalid toner amount.
            }
        }

        public int printPages(int pages) {
            int pagesToPrint = pages;
            if (duplex) {
                pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
                System.out.println("Printing in duplex mode");
            }
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }

        public int getPagesPrinted() {
            return pagesPrinted;
        }

}
