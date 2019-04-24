# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package provides messages and serializations / conversion for the <a href="http://octomap.github.com">OctoMap library</a>."
AUTHOR = "Armin Hornung <armin@hornung.io>"
ROS_AUTHOR = "Armin Hornung <armin@hornung.io>"
HOMEPAGE = "http://ros.org/wiki/octomap_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=5ee5b8b046ae48ad94a2037ca953a67b"

ROS_CN = "octomap_msgs"
ROS_BPN = "octomap_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/octomap_msgs-release/archive/release/melodic/octomap_msgs/0.3.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a70eaf55dd4bbae2c5bfde95b5b2d5f5"
SRC_URI[sha256sum] = "416e70d1633904e7a65bfcd4e1665e5ff5e013d8a9d6a53329d2a449c2002304"
S = "${WORKDIR}/octomap_msgs-release-release-melodic-octomap_msgs-0.3.3-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('octomap-msgs', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('octomap-msgs', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/octomap-msgs/octomap-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/octomap-msgs/octomap-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/octomap-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/octomap-msgs/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
