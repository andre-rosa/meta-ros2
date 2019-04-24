# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A WebSocket interface to rosbridge."
AUTHOR = "Russell Toris <rctoris@wpi.edu>"
HOMEPAGE = "http://ros.org/wiki/rosbridge_server"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-backports.ssl-match-hostname \
    python-tornado \
    python-twisted-core \
    rosapi \
    rosauth \
    rosbridge-library \
    rosbridge-msgs \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/melodic/rosbridge_server/0.11.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "fe48f26ef0c19288707ff2974a69aba4"
SRC_URI[sha256sum] = "49f8201f557a79486c03ea3d4f7b10a57d55b50b43248459f7dd55fd859f9c97"
S = "${WORKDIR}/rosbridge_suite-release-release-melodic-rosbridge_server-0.11.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rosbridge-suite/rosbridge-suite_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rosbridge-suite/rosbridge-suite_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosbridge-suite/rosbridge-suite-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosbridge-suite/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosbridge-suite/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
