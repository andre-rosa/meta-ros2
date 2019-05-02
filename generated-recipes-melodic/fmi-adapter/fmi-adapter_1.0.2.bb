# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wraps FMUs for co-simulation"
AUTHOR = "Ralph Lange <ralph.lange@de.bosch.com>"
HOMEPAGE = "http://wiki.ros.org/fmi_adapter"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BPN = "fmi_adapter"

ROS_BUILD_DEPENDS = " \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    roscpp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/boschresearch/fmi_adapter-release/archive/release/melodic/fmi_adapter/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7de6e181ed741ff2c6e5c13b4ecbea59"
SRC_URI[sha256sum] = "bfe24f7aa9671c953277071e419fc78de19d4ff33b5342fb7aef9e0b8f964f49"
S = "${WORKDIR}/fmi_adapter-release-release-melodic-fmi_adapter-1.0.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/fmi-adapter/fmi-adapter_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/fmi-adapter/fmi-adapter_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fmi-adapter/fmi-adapter-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fmi-adapter/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fmi-adapter/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
