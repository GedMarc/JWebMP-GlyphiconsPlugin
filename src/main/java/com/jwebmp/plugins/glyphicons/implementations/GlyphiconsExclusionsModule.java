package com.jwebmp.plugins.glyphicons.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class GlyphiconsExclusionsModule
		implements IGuiceScanModuleExclusions<GlyphiconsExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.glyphicons");
		return strings;
	}
}
