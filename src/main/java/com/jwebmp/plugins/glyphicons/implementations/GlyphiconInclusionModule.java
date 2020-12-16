package com.jwebmp.plugins.glyphicons.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class GlyphiconInclusionModule implements IGuiceScanModuleInclusions<GlyphiconInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.glyphicons");
		return set;
	}
}
