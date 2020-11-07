public class Config
{
    private Config instance = null;
	public int passTime_, accdTime_, handTime_, delivPts_;
    private Config(int passTime, int accdTime, int handTime, int delivPts)
    {
        passTime_ = passTime;
        accdTime_ = accdTime;
        handTime_ = handTime;
        delivPts_ = delivPts;
    }
	
	public Config GetConfig()
	{
		if (instance == null)
		{
			instance = new Config();
		}
		return instance;
	}
	
	public Config NewConfig(int passTime, int accdTime, int handTime, int delivPts)
	{
		instance = new Config( passTime,  accdTime,  handTime,  delivPts);
		return instance;
	}
	
	private Config()
	{
		
	}
}