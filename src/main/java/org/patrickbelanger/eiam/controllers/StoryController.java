/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.patrickbelanger.eiam.controllers;

import org.patrickbelanger.eiam.model.Story;
import org.patrickbelanger.eiam.services.story.StoryDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Patrick Belanger
 *
 */
@RestController
@RequestMapping("/stories")
public class StoryController {

    @Autowired
    private StoryDetails service;
    
    @GetMapping("/story/{id}")
    public Story getStoryDetails(@PathVariable("id") Long id) {
	return service.getStoryDetails(id);
    }
    
    @PostMapping("/story")
    @ResponseStatus(HttpStatus.CREATED)
    public int storeEmployee(@RequestBody Story story) {
	return service.createStoryDetails(story);
    }
    
}
