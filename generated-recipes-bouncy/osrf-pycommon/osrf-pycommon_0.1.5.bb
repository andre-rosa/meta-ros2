# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Commonly needed Python modules, used by Python software developed at OSRF."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "osrf_pycommon"
ROS_BPN = "osrf_pycommon"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/osrf_pycommon-release/archive/release/bouncy/osrf_pycommon/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "de091037d0cf6059e8d2b743c7086413"
SRC_URI[sha256sum] = "32a8e0fd3fce442d5ef55e68905ed9aceef565c5d4fd4b97d32f5397d05fb9ea"
S = "${WORKDIR}/osrf_pycommon-release-release-bouncy-osrf_pycommon-0.1.5-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('osrf-pycommon', d)}"
ROS_BUILD_TYPE = "ament_python"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('osrf-pycommon', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/osrf-pycommon/osrf-pycommon_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/osrf-pycommon/osrf-pycommon-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/osrf-pycommon/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/osrf-pycommon/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
