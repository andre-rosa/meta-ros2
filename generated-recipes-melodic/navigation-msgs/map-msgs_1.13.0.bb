# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package defines messages commonly used in mapping packages."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/map_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=a3ae2ba3f0f44e61270955e8cd98afcf"

ROS_BPN = "map_msgs"

ROS_BUILD_DEPENDS = " \
    message-generation \
    nav-msgs \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-runtime \
    nav-msgs \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    nav-msgs \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/navigation_msgs-release/archive/release/melodic/map_msgs/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "56b1959d46a31fa91bfdb378ce149dbd"
SRC_URI[sha256sum] = "a0b7044c2fd59448eb714ce14d60c5ff2d0073962e011e6549c7dd99fc916ffc"
S = "${WORKDIR}/navigation_msgs-release-release-melodic-map_msgs-1.13.0-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('navigation-msgs', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-msgs/navigation-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-msgs/navigation-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-msgs/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
