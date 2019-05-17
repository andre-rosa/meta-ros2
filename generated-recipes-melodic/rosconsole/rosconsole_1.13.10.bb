# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "ROS console output library."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Josh Faust"
HOMEPAGE = "http://www.ros.org/wiki/rosconsole"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rosconsole"
ROS_BPN = "rosconsole"

ROS_BUILD_DEPENDS = " \
    apr \
    boost \
    cpp-common \
    log4cxx \
    rostime \
    rosunit \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    apr \
    cpp-common \
    log4cxx \
    rosbuild \
    rostime \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    apr \
    cpp-common \
    log4cxx \
    rosbuild \
    rostime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/rosconsole-release/archive/release/melodic/rosconsole/1.13.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3d440c316445da11e5c77d55d56b1aaa"
SRC_URI[sha256sum] = "a16be47247f622748425d2165afd1a83abe00a57dbe77ef98e801bc5d64d9595"
S = "${WORKDIR}/rosconsole-release-release-melodic-rosconsole-1.13.10-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rosconsole', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rosconsole', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosconsole/rosconsole_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosconsole/rosconsole-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosconsole/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosconsole/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
