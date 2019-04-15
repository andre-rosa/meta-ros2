# OE DISTRO configuration settings common to both ROS 1 and ROS 2 distros.
#
# Copyright (c) 2019 LG Electronics, Inc.

ROS_DISTRO_VERSION_MAJOR = "${ROS_DISTRO}"

# Crystal releases have been given patch numbers, but none of the others have them => use the release date (YYYYMMDD) for the
# minor version, unless this is prior to the first release of a ROS_DISTRO, when the date portion of
# ROS_SUPERFLORE_GENERATION_DATETIME is used.
ROS_DISTRO_VERSION_MINOR = "${@d.getVar('ROS_SUPERFLORE_GENERATION_DATETIME', True)[0:8] \
                               if d.getVar('ROS_DISTRO_RELEASE_DATE', True) == '' else \
                               d.getVar('ROS_DISTRO_RELEASE_DATE', True)}"

# Value determined by superflore and set in conf/ros-distro/include/ROS_DISTRO/generated-ros-distro.inc
ROS_NUM_CACHE_YAML_COMMITS ??= "0"
ROS_DISTRO_VERSION_MICRO = "${ROS_NUM_CACHE_YAML_COMMITS}"

# ROS_META_REVISION is set to "0" in generated-ros-distro.inc and then is incremented there (manually) every time meta-ros is
# released because of a manually created change, ie, NOT as a result of a superflore run (which resets it to "0").
ROS_META_REVISION ??= "0"
ROS_DISTRO_VERSION_REVISION = "${ROS_META_REVISION}"

DISTRO_CODENAME = "${ROS_DISTRO}"
DISTRO_VERSION = "${ROS_DISTRO_VERSION_MAJOR}.${ROS_DISTRO_VERSION_MINOR}.${ROS_DISTRO_VERSION_MICRO}.${ROS_DISTRO_VERSION_REVISION}"

MAINTAINER = "Open Source Robotics Foundation, Inc. <info@openrobotics.org>"
