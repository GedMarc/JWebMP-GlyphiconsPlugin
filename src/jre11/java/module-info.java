import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.glyphicons.GlyphiconsPageConfigurator;
import com.jwebmp.plugins.glyphicons.implementations.GlyphiconsExclusionsModule;

module com.jwebmp.plugins.glyphicons {
	exports com.jwebmp.plugins.glyphicons;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with GlyphiconsPageConfigurator;

	provides IGuiceScanModuleExclusions with GlyphiconsExclusionsModule;
	provides IGuiceScanJarExclusions with GlyphiconsExclusionsModule;

	opens com.jwebmp.plugins.glyphicons to com.fasterxml.jackson.databind, com.jwebmp.core;
}
