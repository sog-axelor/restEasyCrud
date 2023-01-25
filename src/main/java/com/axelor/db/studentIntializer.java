package com.axelor.db;

import com.google.inject.Inject;
import com.google.inject.persist.PersistService;

public class studentIntializer {
	@Inject public studentIntializer(PersistService service) {
		service.start();
	}
}
