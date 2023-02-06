import java.util.*;

public class MostFrequentlyUsed implements IPageReplacementStrategy {
	
    @Override
    public int GetPageFaultsCount(int numOfFramesInPhysicalMemory, int[] pages) 
    {   
        List <Integer> frame_list = new LinkedList<>();

        Stack <Integer> used_list = new Stack<Integer>();
    
        int page_faults = 0;

        for (int i = 0; i < pages.length; i++)
        {
            if (frame_list.size() < numOfFramesInPhysicalMemory) // initial run of algorithm where frame_list isn't full yet
            {
                if (!frame_list.contains(pages[i])) 
				{
                    frame_list.add(pages[i]);
                    page_faults++;
                }

                if (!used_list.contains(pages[i]))
                {
                    used_list.add(pages[i]);
                }
                else
                {
                    used_list.remove(Integer.valueOf(pages[i]));
                    used_list.add(pages[i]);
                }
            }
            else
            {
                if (!frame_list.contains(pages[i])) 
				{

                    // keeps popping the stack until there is an int in the used_list that matches an int in the frame_list
                    while (true)
                    {
                        int temp = used_list.pop();

                        if (frame_list.contains(temp))
                        {
                            frame_list.remove(Integer.valueOf(temp)); // removes the value temp rather than the int at index temp
                            break;
                        }
                    }

                    frame_list.add(pages[i]);
                    page_faults++;
                }

                if (!used_list.contains(pages[i]))
                {
                    used_list.add(pages[i]);
                }
                else
                {
                    used_list.remove(Integer.valueOf(pages[i]));
                    used_list.add(pages[i]);
                }
            }
        }

        return page_faults;
    }
}
