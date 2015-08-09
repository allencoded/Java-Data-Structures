//Linear Hash table algorithm found


public class LinearHashTable {
	
	
	
	    private Object[] data;
	    private int numRecord;
	    private Object deletedObj = new Object();
	    
	    public LinearHashTable()
	    {
	        data = new Object[11];
	        numRecord = 0;
	    }
	    
	    private void grow()
	    {
	        Object[] oldData = data;
	        data = new Object[data.length * 2];
	        numRecord = 0;
	        for (int i = 0; i < oldData.length; i++)
	        {
	            if (oldData[i] != deletedObj && oldData[i] != null)
	                addObject(oldData[i]);
	        }
	    }
	    
	    public Object getObject(int hashID)
	    {
	        int pos = hashID % data.length;
	        int oldPos = pos;
	        do
	        {
	            if (data[pos] == null)
	                return false;
	            if (data[pos] != deletedObj && data[pos].hashCode() == hashID)
	                return data[pos];
	            pos++;
	            if (pos >= data.length)
	                pos = 0;
	        } while (pos != oldPos);
	        
	        
	        return null;
	    }
	    
	    public Object deleteObject(int hashID)
	    {
	        int pos = hashID % data.length;
	        int oldPos = pos;
	        do
	        {
	            if (data[pos] == null)
	                return null;
	            if (data[pos] != deletedObj && data[pos].hashCode() == hashID)
	            {
	                Object retObj = data[pos];
	                data[pos] = deletedObj;
	                numRecord--;
	                return retObj;
	            }
	            pos++;
	            if (pos >= data.length)
	                pos = 0;
	        } while (pos != oldPos);
	        
	        
	        return null;
	    }
	    
	    public boolean addObject(Object obj)
	    {
	        if (numRecord >= (int)(data.length * 0.8))
	            grow();
	        int hashID = obj.hashCode();
	        int pos = hashID % data.length;
	        int oldPos = pos;
	        do
	        {
	            if (data[pos] == null || data[pos] == deletedObj)
	            {
	                data[pos] = obj;
	                numRecord++;
	                return true;
	            }
	            if (data[pos].hashCode() == hashID)
	                return false;
	            pos++;
	            if (pos >= data.length)
	                pos = 0;
	        } while (pos != oldPos);

	        return false;
	    }
	}

