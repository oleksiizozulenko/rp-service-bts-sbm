/*
 * Copyright 2017 Microfocus Inc
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/service-jira
 * 
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.serena.reportportal.extension.bugtracking.sbm;

import com.epam.reportportal.extension.bugtracking.BugTrackingApp;
import com.epam.reportportal.extension.bugtracking.ExternalSystemStrategy;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

/**
 * Entry point for SBM integration App
 *
 * @author Oleksii Zozulenko
 */
public class SbmServiceApp extends BugTrackingApp {

    private static final String DEFAULT_PASS = "reportportal";

    @Override
    public ExternalSystemStrategy externalSystemStrategy() {
        return new SbmStrategy();
    }

    @Bean
    public BasicTextEncryptor basicTextEncryptor() {
        BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
        basicTextEncryptor.setPassword(DEFAULT_PASS);
        return basicTextEncryptor;
    }

    public static void main(String[] args) {
        SpringApplication.run(SbmServiceApp.class, args);
    }

}
