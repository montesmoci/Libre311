// Copyright 2023 Libre311 Authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

//     http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package app.dto.download;

import app.model.servicerequest.ServiceRequestStatus;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.annotation.QueryValue;

import java.time.Instant;

@Introspected
public class DownloadRequestsArgumentsDTO {

    @Nullable
    @QueryValue(value = "service_name")
    private String serviceName;

    @Nullable
    @QueryValue(value = "start_date")
    private Instant startDate;

    @Nullable
    @QueryValue(value = "end_date")
    private Instant endDate;

    @Nullable
    @QueryValue
    private ServiceRequestStatus status;


    public DownloadRequestsArgumentsDTO() {
    }

    @Nullable
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(@Nullable String serviceName) {
        this.serviceName = serviceName;
    }

    @Nullable
    public Instant getStartDate() {
        return startDate;
    }

    public void setStartDate(@Nullable Instant startDate) {
        this.startDate = startDate;
    }

    @Nullable
    public Instant getEndDate() {
        return endDate;
    }

    public void setEndDate(@Nullable Instant endDate) {
        this.endDate = endDate;
    }

    @Nullable
    public ServiceRequestStatus getStatus() {
        return status;
    }

    public void setStatus(@Nullable ServiceRequestStatus status) {
        this.status = status;
    }
}
