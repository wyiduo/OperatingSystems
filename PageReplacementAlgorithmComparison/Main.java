public class Main {
    public static void main(String[] args) {
        int pageFaultsCount, choice;
        PageReplacementSimulator pageReplacementSimulator = new PageReplacementSimulator();
        System.out.println(
                "Please choose the page replacement algorithm: \n\t- Enter 1 for FIFO.\n\t- Enter 2 for LRU. \n\t- Enter 3 for MFU\n\t- Enter 4 for all three algorithms");
        choice = Integer.parseInt(System.console().readLine());
        pageReplacementSimulator.GetUserInput();
        switch (choice) {
            case 1:
                pageReplacementSimulator.SetReplacementStrategy(ReplacementStrategyEnum.FIFO);
                pageFaultsCount = pageReplacementSimulator.GetPageFaultsCount();
                System.out.println("Page faults count for the selected algorithm is: " + pageFaultsCount);
                break;
            case 2:
                pageReplacementSimulator.SetReplacementStrategy(ReplacementStrategyEnum.LRU);
                pageFaultsCount = pageReplacementSimulator.GetPageFaultsCount();
                System.out.println("Page faults count for the selected algorithm is: " + pageFaultsCount);
                break;
            case 3:
                pageReplacementSimulator.SetReplacementStrategy(ReplacementStrategyEnum.MFU);
                pageFaultsCount = pageReplacementSimulator.GetPageFaultsCount();
                System.out.println("Page faults count for the selected algorithm is: " + pageFaultsCount);
                break;
            case 4:
                pageReplacementSimulator.SetReplacementStrategy(ReplacementStrategyEnum.FIFO);
                pageFaultsCount = pageReplacementSimulator.GetPageFaultsCount();
                System.out.println("Page faults count for FIFO algorithm is: " + pageFaultsCount);

                pageReplacementSimulator.SetReplacementStrategy(ReplacementStrategyEnum.LRU);
                pageFaultsCount = pageReplacementSimulator.GetPageFaultsCount();
                System.out.println("Page faults count for LRU algorithm is: " + pageFaultsCount);

                pageReplacementSimulator.SetReplacementStrategy(ReplacementStrategyEnum.MFU);
                pageFaultsCount = pageReplacementSimulator.GetPageFaultsCount();
                System.out.println("Page faults count for MFU algorithm is: " + pageFaultsCount);
        }
    }
}
