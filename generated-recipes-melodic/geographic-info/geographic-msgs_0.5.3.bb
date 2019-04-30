# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages for Geographic Information Systems."
AUTHOR = "Jack O'Quin <jack.oquin@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/geographic_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    std-msgs \
    uuid-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    std-msgs \
    uuid-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    std-msgs \
    uuid-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-geographic-info/geographic_info-release/archive/release/melodic/geographic_msgs/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1111931e3c0a17a179d50cc1b044e32d"
SRC_URI[sha256sum] = "68d46a359b8eec02f2ee60c6997f9bf3399925e9f93c453839a07125ce8f959f"
S = "${WORKDIR}/geographic_info-release-release-melodic-geographic_msgs-0.5.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/geographic-info/geographic-info_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/geographic-info/geographic-info_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geographic-info/geographic-info-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geographic-info/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geographic-info/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
