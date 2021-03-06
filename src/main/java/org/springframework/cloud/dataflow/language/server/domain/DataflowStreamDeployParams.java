/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.dataflow.language.server.domain;

import java.util.Collections;
import java.util.Map;

public class DataflowStreamDeployParams extends DataflowStreamParams {

	private Map<String, String> properties = Collections.emptyMap();

	public DataflowStreamDeployParams() {
	}

	public DataflowStreamDeployParams(String name, String server, Map<String, String> properties) {
		super(name, server);
		if (properties != null) {
			this.properties = properties;
		}
	}

	public static DataflowStreamDeployParams from(String name, String server) {
		return new DataflowStreamDeployParams(name, server, null);
	}

	public static DataflowStreamDeployParams from(String name, String server, Map<String, String> properties) {
		return new DataflowStreamDeployParams(name, server, properties);
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "DataflowStreamDeployParams [name=" + getName() + ", server=" + getServer() + ", properties="
				+ properties + "]";
	}
}
