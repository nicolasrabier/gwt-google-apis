/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.ajaxsearch.client;

import com.google.gwt.ajaxsearch.jsio.client.JSOpaque;

/**
 * Used with {@link ImageSearch#setImageSize(ImageSizeValue)} to control the
 * types of results displayed.
 */
public enum ImageSizeValue {

  /**
   * Small square dimensions, icons
   */
  SMALL("SMALL"),

  /**
   * Images from 2.5k - 16k pixels
   */
  MEDIUM("MEDIUM"),

  /**
   * Images from 16k - 480k pixels
   */
  LARGE("LARGE"),

  /**
   * Images from 480k pixels and up
   */
  EXTRA_LARGE("EXTRA_LARGE");

  private final JSOpaque value;

  private ImageSizeValue(String type) {
    value = new JSOpaque("$wnd.GSearch.IMAGESIZE_" + type);
  }

  JSOpaque getValue() {
    return value;
  }
}
