import java.util.*;

public class FirstInFirstOut implements IPageReplacementStrategy {
	
    @Override
    public int GetPageFaultsCount(int numOfFramesInPhysicalMemory, int[] pages) 
    {
        Queue <Integer> frame_list = new LinkedList<>();
    
        int page_faults = 0;

        for (int i = 0; i < pages.length; i++) {

            if (frame_list.size() < numOfFramesInPhysicalMemory) // initial run of algorithm where frame_list isn't full yet
            {
                if (!frame_list.contains(pages[i])) 
				{
                    frame_list.add(pages[i]);
                    page_faults++;
                }
            } 
            else 
            {
                if (!frame_list.contains(pages[i])) 
				{
                    frame_list.poll();
                    frame_list.add(pages[i]);
                    page_faults++;
                }
            }
        }
    
        return page_faults;
    }
}
