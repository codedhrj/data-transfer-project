/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dataportabilityproject.dataModels.contacts;

import org.dataportabilityproject.dataModels.ContinuationInformation;
import org.dataportabilityproject.dataModels.DataModel;
import ezvcard.VCard;
import java.util.Collection;

public class ContactsModelWrapper implements DataModel {
  private final Collection<VCard> vCards;
  private final ContinuationInformation continuationInformation;

  public ContactsModelWrapper(Collection<VCard> vCards, ContinuationInformation continuationInformation) {
    this.vCards = vCards;
    this.continuationInformation = continuationInformation;
  }

  @Override
  public ContinuationInformation getContinuationInformation() {
    return continuationInformation;
  }

  public Collection<VCard> getvCards() {
    return vCards;
  }
}