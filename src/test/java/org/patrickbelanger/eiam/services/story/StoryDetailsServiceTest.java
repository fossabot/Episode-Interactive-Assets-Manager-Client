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

package org.patrickbelanger.eiam.services.story;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.patrickbelanger.eiam.model.Story;
import org.patrickbelanger.eiam.services.story.common.ServiceTestConfiguration;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author Patrick Belanger
 *
 */
public class StoryDetailsServiceTest extends ServiceTestConfiguration {

    private RestTemplate restTemplate;
    private Story sut;
    private static final String EXPECTED_STORY_NAME = "Example story name";
    private static final String EXPECTED_STORY_DESCRIPTION = "Example story name";
    private static final String EXPECTED_STORY_URL = "Story link of the story";
    
    
    @BeforeEach
    public void setUp() {
	restTemplate = new RestTemplate();
    }
    
    @Test
    public void getStoryDetails_shouldBeAbleToGetStoryDetailsById() {
	sut = restTemplate.getForObject(String.format("%s%s", getHostPort(), "stories/story/1"), Story.class);
	Assertions.assertNotNull(sut);
	Assertions.assertEquals(EXPECTED_STORY_NAME, sut.getStoryName());
	Assertions.assertEquals(EXPECTED_STORY_DESCRIPTION, sut.getStoryDescription());
	Assertions.assertEquals(EXPECTED_STORY_URL, sut.getStoryUrl());
    }
       
    @AfterEach
    public void tearDown() {
	restTemplate = null;
	sut = null;
    }
    
}
