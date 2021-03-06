/**
 * Copyright 2018 Comcast Cable Communications Management, LLC
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.vinyldns.java.model.zone;

public class GetZoneRequest {
  private final String zoneId;

  public GetZoneRequest(String zoneId) {
    this.zoneId = zoneId;
  }

  public String getZoneId() {
    return zoneId;
  }

  @Override
  public String toString() {
    return "GetZoneRequest{" + "zoneId='" + zoneId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    GetZoneRequest that = (GetZoneRequest) o;
    return zoneId.equals(that.zoneId);
  }

  @Override
  public int hashCode() {
    return zoneId.hashCode();
  }
}
