# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "roswtf is a tool for diagnosing issues with a running ROS system. Think of it as a FAQ implemented in code."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Ken Conley"
HOMEPAGE = "http://ros.org/wiki/roswtf"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_comm"
ROS_BPN = "roswtf"

ROS_BUILD_DEPENDS = " \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    python-paramiko \
    python-rospkg \
    rosbuild \
    rosgraph \
    roslaunch \
    roslib \
    rosnode \
    rosservice \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-paramiko \
    python-rospkg \
    rosbuild \
    rosgraph \
    roslaunch \
    roslib \
    rosnode \
    rosservice \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    cmake-modules \
    rosbag \
    std-srvs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/roswtf/1.14.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b4a358d5336ec1bb46d5e587a3df9272"
SRC_URI[sha256sum] = "4b80685e087fb64bb3c54d156c2a5b7953092dd83c14906d311def246ebfdd93"
S = "${WORKDIR}/ros_comm-release-release-melodic-roswtf-1.14.3-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros-comm', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ros-comm', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-comm/ros-comm_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-comm/ros-comm-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-comm/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-comm/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
