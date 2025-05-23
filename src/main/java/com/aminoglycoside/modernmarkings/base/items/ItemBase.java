package com.aminoglycoside.modernmarkings.base.items;

import com.aminoglycoside.modernmarkings.base.Base;
import com.aminoglycoside.modernmarkings.base.init.ModItems;
import com.aminoglycoside.modernmarkings.base.util.Resource;
import com.aminoglycoside.modernmarkings.base.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    /**
     * Creating the Base of a new Mod Item
     * @param name                 Name for the Item
     */
    public ItemBase(String name) {
        /* Setting the Name of the Block / Item */
        setTranslationKey(name);
        /* Setting the Registry Name of the Block / Item */
        setRegistryName(Resource.MOD_ID, name);
        /* The Tab where the Item will be placed */
        setCreativeTab(Base.MOD_TAB);

        ModItems.ITEMS.add(this);
    }

    /**
     * Registering the Model of the Mod Items
     */
    @Override
    public void registerModels() {
        Base.proxy.registerItemRenderer(this, 0, "inventory");
    }
}