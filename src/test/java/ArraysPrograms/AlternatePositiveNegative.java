	public int[] rearrangeArray(int[] nums) {
  
		ArrayList<Integer> pos = new ArrayList<Integer>();
		ArrayList<Integer> neg = new ArrayList<Integer>();

		   
		int n = nums.length;
        for(int i=0;i<nums.length;++i)
        {
           if(nums[i]>0)
           {
        	   pos.add(nums[i]);
           }
           else {
        	   neg.add(nums[i]);
           }
        }
        
        if(pos.size()>neg.size())
        {
        	for(int i=0;i<neg.size();++i)
        	{
        		nums[2*i] = pos.get(i);
        		nums[2*i+1]=neg.get(i);
        	}
        	int index = neg.size()*2;
        	for(int i=neg.size();i<pos.size();++i)
        	{
        		nums[index]=pos.get(i);
        		index++;
        	}
        }
        else {
        	
        	for(int i=0;i<pos.size();++i)
        	{
        		nums[2*i] = pos.get(i);
        		nums[2*i+1]=neg.get(i);
        	}
        	int index = pos.size()*2;
        	for(int i=pos.size();i<neg.size();++i)
        	{
        		nums[index]=neg.get(i);
        		index++;
        	}
        	
        }
       return nums; 
		
	}

	
