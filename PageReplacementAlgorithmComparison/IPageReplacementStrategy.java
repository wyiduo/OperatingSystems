public interface IPageReplacementStrategy {
    public int GetPageFaultsCount(int numOfFramesInPhysicalMemory, int[] pages);
}
