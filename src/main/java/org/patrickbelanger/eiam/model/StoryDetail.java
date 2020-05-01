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

package org.patrickbelanger.eiam.model;

/**
 * 
 * @author Patrick Belanger
 *
 */
public class StoryDetail {

    private String storyName;
    private String storyDescription;
    private String storyUrl;
    
    public String getStoryName() {
        return storyName;
    }
   
    public void setStoryName(String storyName) {
        this.storyName = storyName;
    }
    
    public String getStoryDescription() {
        return storyDescription;
    }
    
    public void setStoryDescription(String storyDescription) {
        this.storyDescription = storyDescription;
    }
    
    public String getStoryUrl() {
        return storyUrl;
    }
    
    public void setStoryUrl(String storyUrl) {
        this.storyUrl = storyUrl;
    }
    
}
