# bionic/ros-distro-plaform-preferred-versions.inc
#
# Copyright (c) 2019 LG Electronics, Inc.

# Set PREFERRED_VERSION_<PN> here for platform packages for which the layers provide multiple versions.

PREFERRED_VERSION_cppunit ?= "1.14.0"
# Ubuntu bionic has v4.15, but OpenEmbedded thud only provides v4.14 and v4.18 => select the latter as the former might be missing
# something that other components expect to be present.
PREFERRED_VERSION_linux-yocto ?= "4.18%"
# Ubuntu bionic provides v2.1.1:
PREFERRED_VERSION_python-matplotlib ?= "2.1.2"
PREFERRED_VERSION_yajl ?= "2.1.0"
