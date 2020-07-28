#!/bin/bash
#
# Copyright 2020 leoluzh (https://www.github.com/leoluzh)
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#


java  -jar payara-micro-5.183.jar municipio-service/target/municipio.war --port 8180 &
java  -jar payara-micro-5.183.jar unidade-federativa-service/target/unidadefederativa.war --port 8280 &
java  -jar payara-micro-5.183.jar view/target/view.war --port 8080