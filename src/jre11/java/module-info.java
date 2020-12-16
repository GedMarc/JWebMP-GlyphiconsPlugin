import com.jwebmp.plugins.glyphicons.implementations.GlyphiconInclusionModule;

module com.jwebmp.plugins.glyphicons {
	exports com.jwebmp.plugins.glyphicons;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.glyphicons.GlyphiconsPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.glyphicons.implementations.GlyphiconsExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with GlyphiconInclusionModule;
	
	opens com.jwebmp.plugins.glyphicons to com.fasterxml.jackson.databind, com.jwebmp.core;
}
