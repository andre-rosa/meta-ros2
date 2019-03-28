# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The ability to use Python in the ament buildsystem in CMake."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "ament_cmake"
ROS_BPN = "ament_cmake_python"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-core-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-core-native \
"

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_python/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6137a15ec0bc2b6e18dd6a0589342969"
SRC_URI[sha256sum] = "196e1acf5e949daae5d1fa6822ab126abe7c4fa8001bb610132e374977ef0922"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_python-0.6.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ament-cmake', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ament-cmake', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ament-cmake/ament-cmake_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ament-cmake/ament-cmake-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ament-cmake/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ament-cmake/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
