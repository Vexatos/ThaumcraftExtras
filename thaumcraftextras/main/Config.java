package thaumcraftextras.main;

import java.io.File;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.common.Configuration;

public class Config {


	public static void loadConfig(FMLPreInitializationEvent e){
		Configuration config = new Configuration(e.getSuggestedConfigurationFile());

	        researchBlockId = config.getBlock("researchBlock", 224).getInt();
	        fireBlockId = config.getBlock("fireBlock", 225).getInt();
	        airBlockId = config.getBlock("airBlock", 226).getInt();
	        earthBlockId = config.getBlock("earthBlock", 227).getInt();
	        waterBlockId = config.getBlock("waterBlock", 228).getInt();
	        lightBlockId = config.getBlock("lightBlock", 229).getInt();
	        
	        pechTradeTier1Id = config.getItem("pechTradeTier1", 12225).getInt();
	        pechTradeTier2Id = config.getItem("pechTradeTier2", 12226).getInt();
	        pechTradeTier3Id = config.getItem("pechTradeTier3", 12227).getInt();
	        pechTradeTier4Id = config.getItem("pechTradeTier4", 12228).getInt();
	        pechTradeTier5Id = config.getItem("pechTradeTier5", 12229).getInt();

	        magicTradeTier1Id = config.getItem("magicTradeTier1", 12230).getInt();
	        magicTradeTier2Id = config.getItem("magicTradeTier2", 12231).getInt();
	        magicTradeTier3Id = config.getItem("magicTradeTier3", 12232).getInt();
	        magicTradeTier4Id = config.getItem("magicTradeTier4", 12233).getInt();
	        magicTradeTier5Id = config.getItem("magicTradeTier5", 12234).getInt();

	        enderFociId = config.getItem("enderFoci", 13230).getInt();
	        arrowFociId = config.getItem("arrowFoci", 13231).getInt();
	        healFociId = config.getItem("healFoci", 13232).getInt();
	        speedFociId = config.getItem("speedFoci", 13233).getInt();
	        pechFociId = config.getItem("pechFoci", 13234).getInt();

	        lightShardId = config.getItem("lightShard", 14201).getInt();

	        enderFoci = config.get(Configuration.CATEGORY_GENERAL, "enderFoci", true).getBoolean(enderFoci);
	    	arrowFoci = config.get(Configuration.CATEGORY_GENERAL, "arrowFoci", true).getBoolean(arrowFoci);
	    	healFoci = config.get(Configuration.CATEGORY_GENERAL, "healFoci", true).getBoolean(healFoci);
	    	speedFoci = config.get(Configuration.CATEGORY_GENERAL, "speedFoci", true).getBoolean(speedFoci);
	    	pechFoci = config.get(Configuration.CATEGORY_GENERAL, "pechFoci", true).getBoolean(pechFoci);
	    	fireBlock = config.get(Configuration.CATEGORY_GENERAL, "fireBlock", true).getBoolean(fireBlock);
	    	earthBlock = config.get(Configuration.CATEGORY_GENERAL, "earthBlock", true).getBoolean(earthBlock);
	    	waterBlock = config.get(Configuration.CATEGORY_GENERAL, "waterBlock", true).getBoolean(waterBlock);
	    	lightBlock = config.get(Configuration.CATEGORY_GENERAL, "lightBlock", true).getBoolean(lightBlock);
	    	pechTrade = config.get(Configuration.CATEGORY_GENERAL, "pechTrade", true).getBoolean(pechTrade);
	    	magicTrade = config.get(Configuration.CATEGORY_GENERAL, "magicTrade", true).getBoolean(magicTrade);

	        config.save();
}
	
    public static int researchBlockId;
    public static int fireBlockId;
    public static int airBlockId;
    public static int waterBlockId;
    public static int earthBlockId;
    public static int lightBlockId;
    //public static int darkBlockId;
    
    public static int pechTradeTier1Id;
    public static int pechTradeTier2Id;
    public static int pechTradeTier3Id;
    public static int pechTradeTier4Id;
    public static int pechTradeTier5Id;
    
    public static int magicTradeTier1Id;
    public static int magicTradeTier2Id;
    public static int magicTradeTier3Id;
    public static int magicTradeTier4Id;
    public static int magicTradeTier5Id;
    
    public static int enderFociId;
    public static int arrowFociId;  
    public static int healFociId;
    public static int speedFociId;
    public static int pechFociId;
    
    public static int lightShardId;
    
    public static boolean enderFoci;
    public static boolean arrowFoci;
    public static boolean healFoci;
    public static boolean speedFoci;
    public static boolean pechFoci;
    public static boolean pechTrade;
    public static boolean magicTrade;
    public static boolean fireBlock;
    public static boolean waterBlock;
    public static boolean lightBlock;
    public static boolean earthBlock;
}
