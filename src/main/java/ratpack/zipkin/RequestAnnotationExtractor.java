/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ratpack.zipkin;

import com.github.kristofa.brave.KeyValueAnnotation;
import ratpack.http.Request;

import java.util.Collection;
import java.util.Collections;

@FunctionalInterface
public interface RequestAnnotationExtractor {
  Collection<KeyValueAnnotation> annotationsForRequest(Request request);

  RequestAnnotationExtractor DEFAULT = (request -> Collections.emptyList());
}
