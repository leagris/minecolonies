package com.minecolonies.tileentities;

import com.minecolonies.entity.EntityCitizen;
import net.minecraft.world.World;

public abstract class TileEntityHutWorker extends TileEntityHut
{
    private String jobName = "";

    public String getJobName()
    {
        return jobName;
    }
}
