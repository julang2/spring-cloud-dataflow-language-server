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
package org.springframework.cloud.dataflow.language.server.stream;

import org.springframework.dsl.domain.Hover;
import org.springframework.dsl.domain.Position;
import org.springframework.dsl.service.DslContext;
import org.springframework.dsl.service.Hoverer;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;

@Component
public class StreamLanguageHoverer extends AbstractStreamLanguageService implements Hoverer {

    @Override
    public Mono<Hover> hover(DslContext context, Position position) {
        return Mono.empty();
    }
}
