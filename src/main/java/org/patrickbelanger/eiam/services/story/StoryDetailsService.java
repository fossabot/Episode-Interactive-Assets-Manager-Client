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

import org.patrickbelanger.eiam.model.Story;
import org.patrickbelanger.eiam.services.common.AbstractServices;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Patrick Belanger
 *
 */
@Service
public class StoryDetailsService extends AbstractServices implements StoryDetails {

    @Override
    public Story getStoryDetails(Long id) {
	final String sql = "SELECT * FROM STORY_DETAILS WHERE ID=?";
	return (Story) read(sql, new Object[] { id }, Story.class);
    }

    @Override
    public int createStoryDetails(Story story) {
	final String sql = "INSERT INTO STORY_DETAILS (STORY_DESCRIPTION, STORY_NAME, STORY_URL) VALUES(?, ?, ?)";
	return create(sql, new Object[] { story.getStoryDescription(), story.getStoryName(), story.getStoryUrl() });
    }

}
