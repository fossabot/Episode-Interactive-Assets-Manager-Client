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

package org.patrickbelanger.controllers;

import java.util.List;

import org.patrickbelanger.eiam.model.StoryDetail;
import org.patrickbelanger.services.story.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    private Story service;
    
    @GetMapping
    public List<StoryDetail> findAll() {
	return service.findAll();
    }
    
    @GetMapping("/story")
    public StoryDetail getStoryDetail() {
	return service.getStoryDetail();
    }
    
}
