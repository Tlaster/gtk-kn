#!/usr/bin/env bash
#
# Copyright (c) 2024 gtk-kn
#
# This file is part of gtk-kn.
# gtk-kn is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
# gtk-kn is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
# GNU Lesser General Public License for more details.
# You should have received a copy of the GNU General Public License
# along with gtk-kn. If not, see https://www.gnu.org/licenses/.
#

set -e -v

# Update package lists
apt-get update

# Install packages without prompts
DEBIAN_FRONTEND=noninteractive apt-get install -y --no-install-recommends \
  apt-utils \
  openjdk-17-jdk-headless \
  python3-pip \
  gcc-multilib \
  libgirepository1.0-dev \
  libadwaita-1-dev \
  libgtksourceview-5-dev \
  libwebkitgtk-6.0-dev

# Clean up package lists
apt-get clean