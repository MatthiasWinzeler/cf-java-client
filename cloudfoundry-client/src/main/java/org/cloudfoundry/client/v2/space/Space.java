/*
 * Copyright 2013-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.client.v2.space;

import rx.Observable;

/**
 * Main entry point to the Cloud Foundry Space Client API
 */
public interface Space {

    /**
     * Makes the <a href="http://apidocs.cloudfoundry.org/214/spaces/list_all_spaces.html">List Spaces</a> request
     *
     * @param request the List Spaces request
     * @return the response from the List Spaces request
     */
    Observable<ListSpacesResponse> list(ListSpacesRequest request);
}
