# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "rosconsole_bridge is a package used in conjunction with console_bridge and rosconsole for connecting console_bridge-based logging to rosconsole-based logging."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Ioan Sucan"
HOMEPAGE = "http://www.ros.org/wiki/rosconsole_bridge"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rosconsole_bridge"
ROS_BPN = "rosconsole_bridge"

ROS_BUILD_DEPENDS = " \
    console-bridge \
    cpp-common \
    rosconsole \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    console-bridge \
    cpp-common \
    rosconsole \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    console-bridge \
    cpp-common \
    rosconsole \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/rosconsole_bridge-release/archive/release/melodic/rosconsole_bridge/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "02d835316fbda82f37e0a6db9df0a09d"
SRC_URI[sha256sum] = "d47fadd37a04d4f165bef5173d536190baa3006dac2fa0235a14527d32169afc"
S = "${WORKDIR}/rosconsole_bridge-release-release-melodic-rosconsole_bridge-0.5.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('rosconsole-bridge', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('rosconsole-bridge', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosconsole-bridge/rosconsole-bridge_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosconsole-bridge/rosconsole-bridge-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosconsole-bridge/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosconsole-bridge/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
