/*
 * Copyright 2017 The Mifos Initiative.
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
package io.mifos.rhythm.service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author Myrle Krantz
 */
@Component
@ConfigurationProperties(prefix="rhythm")
public class RhythmProperties {
  private String user;
  private Long beatCheckRate = TimeUnit.MINUTES.toMillis(10);

  public RhythmProperties() {
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getUser() {
    return user;
  }

  public Long getBeatCheckRate() {
    return beatCheckRate;
  }

  public void setBeatCheckRate(Long beatCheckRate) {
    this.beatCheckRate = beatCheckRate;
  }
}