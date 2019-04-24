# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This is a wrapper around the marker detection library ArUco."
AUTHOR = "Lukas Pfeifhofer <lukas.pfeifhofer@devlabs.pro>"
HOMEPAGE = "http://wiki.ros.org/tuw_aruco"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    dynamic-reconfigure \
    image-geometry \
    image-transport \
    marker-msgs \
    roscpp \
    rospy \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    dynamic-reconfigure \
    image-geometry \
    image-transport \
    marker-msgs \
    roscpp \
    rospy \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    dynamic-reconfigure \
    image-geometry \
    image-transport \
    marker-msgs \
    roscpp \
    rospy \
    std-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tuw-robotics/tuw_marker_detection-release/archive/release/melodic/tuw_aruco/0.1.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c7cde217af31edd26712868f7bad8e25"
SRC_URI[sha256sum] = "98fd74948391d0642bc7d6c8f4b679bdbe748da0b17856ddcb782c1e797fbf1a"
S = "${WORKDIR}/tuw_marker_detection-release-release-melodic-tuw_aruco-0.1.1-1"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/tuw-marker-detection/tuw-marker-detection_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/tuw-marker-detection/tuw-marker-detection_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tuw-marker-detection/tuw-marker-detection-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tuw-marker-detection/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tuw-marker-detection/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
