class Record
	{
	    private int customerid;
	    private String content;
	    
	    public Record(int id, String content)
	    {
	        this.customerid = id;
	        this.content = content;
	    }    
	    
	    public int getId()
	    {
	        return customerid;
	    }

	    public void setId(int id)
	    {
	        this.customerid = id;
	    }
	    
	    public String getContent()
	    {
	        return content;
	    }

	    public void setContent(String content)
	    {
	        this.content = content;
	    }

	    public int hashCode()
	    {
	        return customerid;
	    }
	}

