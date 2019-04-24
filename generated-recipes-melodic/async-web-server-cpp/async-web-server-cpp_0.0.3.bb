# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Asynchronous Web/WebSocket Server in C++"
AUTHOR = "Russell Toris <rctoris@wpi.edu>"
HOMEPAGE = "http://ros.org/wiki/async_web_server_cpp"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    boost \
    openssl \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    openssl \
    python-websocket-client \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    openssl \
    python-websocket \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslib \
    rospy \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/gt-rail-release/async_web_server_cpp-release/archive/release/melodic/async_web_server_cpp/0.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9a727454a9d206b7bdf2d58afa84f3c9"
SRC_URI[sha256sum] = "45d13cce4a77b0e5e67b9ed7be20691e0425861c5a48a653d4a3bdff997840c6"
S = "${WORKDIR}/async_web_server_cpp-release-release-melodic-async_web_server_cpp-0.0.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/async-web-server-cpp/async-web-server-cpp_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/async-web-server-cpp/async-web-server-cpp_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/async-web-server-cpp/async-web-server-cpp-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/async-web-server-cpp/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/async-web-server-cpp/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
