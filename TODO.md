# TODO Before First PR

- ros-workspace: local_setup: _ament_python_executable="/home/herb.kuta/z/work/lge/ros/lgsvl/build-webos/BUILD/sysroots/x86_64-linux/usr/bin/python3-native/python

./usr/bin/python3-config
./usr/bin/python3.5-config
./usr/bin/python3.5m-config
./usr/lib/python3.5/config-3.5m/Makefile
./usr/lib/python3.5/config/Makefile
./usr/lib/python3.5/_sysconfigdata.py
./usr/lib/urdfdom/cmake/urdfdom-config.cmake
./usr/lib/python2.7/config/Makefile
./usr/lib/python2.7/_sysconfigdata.py
./usr/lib/opkg/info/ntp.preinst
./usr/lib/opkg/info/systemd-extra-utils.preinst
./usr/lib/opkg/info/pulseaudio-server.preinst
./usr/lib/opkg/info/dbus-1.preinst
./usr/lib/opkg/info/lttng-tools.preinst
./usr/lib/opkg/info/systemd.preinst
./usr/lib/node_modules/*
./usr/share/node-inspector/*

- Run morty-sf-crystal-trial in qemu; -B morty-sf-crystal; force push and announce
- mcf
- cmake-s to put into -dev:

        /usr/share/orocos_kdl/OrocosKDLTargets-release.cmake
                                orocos_kdl-config.cmake
                                orocos_kdl-config-version.cmake
                                OrocosKDLTargets.cmake
        /usr/lib./urdfdom/cmake/urdfdom-config.cmake

- Decide if default ROS_DISTRO
- ROS_DISTRO_COMPAT: initially just "crystal"
- Test Bblayers*
- Add copyright notices to remaining files.
- Publish spec r32
- Publish spec r33:
    - MS 2 = crystal + DISTRO = "ros2"
    - MS 3 = crystal + DISTRO = "webos" OSE build 69
    - MS 4 = dashing + DISTRO = "webos" OSE build 8X
- Add `[crystal]`.
- Get com.webos.service.rosbridge to build.
- Documentation
    - Build instructions
    - List of packages excluded
- Where to put PREFERRED_VERSION_opencv = "3.2%" crystal/ros-distro-preferred-versions.inc -- but it's a platform pkg
- Update for newer platform components.
- Add downloadfilename parameter:

        recipes-devtools/python/python-rosdep.inc:7:SRC_URI = "https://github.com/ros-infrastructure/rosdep/archive/${PV}.tar.gz"
        recipes-devtools/python/python-rospkg.inc:7:SRC_URI = "https://github.com/ros-infrastructure/rospkg/archive/${PV}.tar.gz"
        recipes-devtools/python/python-rosdistro.inc:7:SRC_URI = "https://github.com/ros-infrastructure/rosdistro/archive/${PV}.tar.gz"
        recipes-extended/fcl/fcl_0.3.2.bb:9:SRC_URI = "https://github.com/flexible-collision-library/fcl/archive/${PV}.tar.gz \

- Add REQUIRED_DISTRO_FEATURES to .inc-s.
- Add ament* back to one recipe under variants.
- Check PR-s from `bmwcarit:meta-ros`.
- Examine the additions to `[devel]` of <https://github.com/lgsvl/meta-ros2> since it was branched from from `[master]` of
  <https://github.com/bmwcarit/meta-ros>, cherry-picking any onto `[thud-superflore-crystal]` that are still needed.
- Confirm that all of the builds of the `*-vendor` packages do the right thing.
    - bouncy:
        - ./googletest/gmock-vendor_1.8.0.bb
        - ./googletest/gtest-vendor_1.8.0.bb
        - ./libyaml-vendor/libyaml-vendor_1.0.0.bb
        - ./poco-vendor/poco-vendor_1.1.1.bb
        - ./resource-retriever/libcurl-vendor_2.1.0.bb
        - ./rviz/rviz-assimp-vendor_4.0.2.bb
        - ./rviz/rviz-ogre-vendor_4.0.2.bb
        - ./rviz/rviz-yaml-cpp-vendor_4.0.2.bb
        - ./tinyxml2-vendor/tinyxml2-vendor_0.4.0.bb
        - ./tinyxml-vendor/tinyxml-vendor_0.5.0.bb
        - ./uncrustify/uncrustify-vendor_0.66.1-1.bb

    - crystal:
        - console-bridge-vendor/console-bridge-vendor_1.1.0.bb: builds v0.4.1 if not present on system or < 0.4.1
        - googletest/gtest-vendor_1.8.0.bb
        - libyaml-vendor/libyaml-vendor_1.0.0.bb
        - poco-vendor/poco-vendor_1.1.1.bb
        - resource-retriever/libcurl-vendor_2.1.0.bb: build v7.57 if no curl present on system
        - rosbag2/ros1-rosbag-storage-vendor_0.0.7.bb
        - rosbag2/shared-queues-vendor_0.0.7.bb
        - rosbag2/sqlite3-vendor_0.0.7.bb
        - rviz/rviz-assimp-vendor_5.1.0.bb
        - rviz/rviz-ogre-vendor_5.1.0.bb
        - tinydir-vendor/tinydir-vendor_1.0.1.bb
        - tinyxml2-vendor/tinyxml2-vendor_0.6.1.bb
        - tinyxml-vendor/tinyxml-vendor_0.5.0.bb
        - uncrustify-vendor/uncrustify-vendor_1.1.0.bb
        - yaml-cpp-vendor/yaml-cpp-vendor_5.0.0.bb

- python-catkin-pkg-modules -> check contents!! Currently it's mapped to python-catkin-pkg.
- Test catkin changes for ROS_PYTHON_VERSION
- With meta-ros in bblayers, `bitbake-layers layerindex-fetch` fails.
- Does ROS require systemd? NO.
- Clean build of cppcheck:

    WARNING: cppcheck-1.87-r0 do_patch:
    Some of the context lines in patches were ignored. This can lead to incorrectly applied patches.
    The context lines in the patches can be updated with devtool:

        devtool modify <recipe>
        devtool finish --force-patch-refresh <recipe> <layer_path>

    Then the updated patches and the source tree (in devtool's workspace)
    should be reviewed to make sure the patches apply in the correct place
    and don't introduce duplicate lines (which can, and does happen
    when some of the context is ignored). Further information:
    http://lists.openembedded.org/pipermail/openembedded-core/2018-March/148675.html
    https://bugzilla.yoctoproject.org/show_bug.cgi?id=10450
    Details:
    Applying patch 0001-makefile.patch
    patching file Makefile
    Hunk #3 succeeded at 292 with fuzz 1 (offset 5 lines).

    Now at patch 0001-makefile.patch

- /usr/share/node-inspector/node_modules/ have build paths
- Get ml-classifiers, cartographer, and keystroke to build.
- Do the recipes for the components found in `files/<ROS_DISTRO>/newer-platform-components.list` need
 `inherit ros_distro_${ROS_DISTRO}` ?
- Fix console-bridge-vendor to generate pkgconfig file correctly, then remove console-bridge_0.4.2.bb
- Perhaps need other appends for replacement packages? cf `libjpeg-turbo` and `jpeg`:

        # Drop-in replacement for jpeg
        PROVIDES = "jpeg"
        RPROVIDES_${PN} += "jpeg"
        RREPLACES_${PN} += "jpeg"
        RCONFLICTS_${PN} += "jpeg"

  Perhaps get rid of `PREFERRED_PROVIDER_libyaml*`?

- `WIP uncrustify-vendor-1.1.0.inc`: Need to CMakeLists.txt to force a local build.
- Remove any licenses under `licenses` that are now supplied upstream.
- `require conf/distro/include/security_flags.inc` ??
- Make sure layer compat with output from `bitbake-layers create-layer`.
- Run `yocto-check-layer` XXX
- Investigate sstate signature difference between DISTRO = ros2 and nodistro.
- Add more tests for Milestone 2 done?

    ``` text
    # ros2 topic list/echo/pub/hz/info
    # ros2 service list
    # ros2 node list/info
    # ros2 launch *** (topic/service tested after installing demo-nodes-cpp)
    # ros2 pkg list (after export AMENT_PREFIX_PATH="/usr")
    ```

- `WIP ros2_distro.bbclass: recipe-sysroot in *.cmake files`: Is this correct place?
  These contain absolute paths prefiex with WORKDIR, which would be removed by `rm_work`:

        ./armv5e/urdfdom/usr/lib/urdfdom/cmake/urdfdom-config.cmake
        ./armv5e/gpgme/usr/lib/cmake/Gpgmepp/GpgmeppConfig.cmake
        ./armv5e/laser-geometry/usr/share/laser_geometry/cmake/laser_geometryExport.cmake
        ./armv5e/pcl/usr/share/pcl-1.8/PCLConfig.cmake
        ./armv5e/fastrtps/usr/share/fastrtps/cmake/fastrtps-targets.cmake
        ./armv5e/orocos-kdl/usr/share/orocos_kdl/orocos_kdl-config.cmake
        ./armv5e/sophus/usr/share/sophus/cmake/SophusTargets.cmake
        ./armv5e/resource-retriever/usr/share/resource_retriever/cmake/resource_retrieverExport.cmake
        ./armv5e/ecl-eigen/usr/share/ecl_eigen/cmake/ecl_eigenExport.cmake
        ./armv5e/pcl-conversions/usr/share/pcl_conversions/cmake/ament_cmake_export_include_directories-extras.cmake
        ./armv5e/eigen-stl-containers/usr/share/eigen_stl_containers/cmake/ament_cmake_export_include_directories-extras.cmake

- Update **REDISTRIBUTIONS**:
    - Added: XXX Add branch to commit message??

        * a806e968 DRAFT cppcheck-native: Import from meta-sca@1340a465cd183eccc43d9a6334c7cdff0b5888b2; renamed to cppcheck
        * 8da953e3 DRAFT cppunit_1.31.2.bb: Import from meta-oe@37a43408743d2445d548754967995df9ea1b0b14
        * 451c6283 DRAFT graphviz_2.40.1.bb: Import from meta-oe[master]@a07c969aebea4edb66babbc264777f626ed8eb7b
        * 2a4d71ff DRAFT python-matplotlib_2.0.2.bb: Import from meta-oe@10c8c39c25d902ab5268fa48ac2bc0e42e65b179; renamed to convert to Python 3
        * 92e88de4 DRAFT python-flake8_2.4.0.bb: Import from meta-cloud-services@6525fbca288d5d06be696447ad7f457af01f080d; renamed to convert to Python 3
        * 40bb2381 DRAFT python-cmd2_0.9.2.bb: Import from meta-openstack@f95a30ad96e900bade1e9e3c7538569fc049d72a; renamed to convert to Python 3
        * f33197b3 DRAFT python-pyflakes_1.6.0.bb: Import from meta-python@8760980fccbb0419e6562719c9efb8a2260fe819; renamed to convert to Python 3
        * 5a669b88 DRAFT python-prettytable_0.7.2.bb: Import from meta-python@b7e64bc2d762f96b1d98f62185d6c4bf86cd1158; renamed to convert to Python 3
        * c4d4e5b8 DRAFT python-pep8_1.7.1.bb: Import from meta-python@37049d721fc0b1809cb4741d6c960664bf08f774; renamed to convert to Python 3
        * dd00be54 DRAFT python-mccabe_0.4.0.bb: Import from meta-python@08355759b158f4098170a6bc64a26deae065bce8; renamed to convert to Python 3
        * 2d1335e6 DRAFT python-mock_2.0.0.bb: Import from meta-python@9b743db42aa81b3ea4ca519c095f0836ba25a1d8; renamed to convert to Python 3
        * 9cc0e33a2 DRAFT Import python*-psutil v5.4.6 from meta-python@c821fe0f2f08b49ab545e44c888f7cfacfe6c0f2
    - XXX Ones for **morty**

    - Existing:

        The log4cxx recipe originated from the recipe in the OpenEmbedded (Classic) Development (cf. http://cgit.openembedded.org/openembedded/tree/recipes/log4cxx) licensed with the MIT License.

        The yaml-cpp recipe originated from the recipe in Kartik Mohta's OpenEmbedded layer (cf. https://github.com/kartikmohta/meta-km/blob/master/recipes-devtools/yaml-cpp/yaml-cpp_0.3.0.bb) licensed with the MIT License.

        The python-ecdsa recipe originated from the recipe in the OpenStack Yocto layer (cf. http://git.yoctoproject.org/clean/cgit.cgi/meta-cloud-services/tree/meta-openstack/recipes-devtools/python/python-ecdsa_0.13.bb?id=38973e8bc393a4ca36090c58c8b6eb6d093ea69a) licensed with the MIT License.

        The core-image-ros-* recipes originated from the core-image-minimal recipe in OpenEmbedded Core (cf. http://cgit.openembedded.org/openembedded-core/tree/meta/recipes-core/images/core-image-minimal.bb) licensed with the MIT License.

- Re-order commits along`[r.hk/thud-superflore-crystal]`:
    - Drop recipes, bbclasses from `meta-ros` now provided by **thud**.
    - Add PR-s from `bmwcarit:meta-ros`.
    - Add cherry-picks from `lgsvl:meta-ros2`.
    - Update versions of system package recipes to Ubuntu bionc ones; import several from other layers.
    - `recipes-ros` -> `recipes-ros1`
    - Move recipes in wrong tree to correct one.
    - Add bbclasses; rename/modify existing ones + recipes affected by renames.
    - Add/modify conf-s.
    - Add generated **melodic** and required files.
    - Add generated **bouncy** and required files.
    - Add generated **crystal** and required files.
    - Move recipes to `v1-recipes-{ros1,ros2}` and `unused-recipes-{ros1,ros2}`
    - Add `includes-{ros1,ros2}` so that **crystal** `core-image-ros-roscore` builds => Milestone 2.
    - Add `includes-{ros1,ros2}` so that **crystal** `core-image-ros-world` without changes to `DISTRO_FEATURES` builds => Milestone 3.
    - XXX
    - Add conf/layer.conf at end of chain.
    - In the unlikely event that a `[morty]` branch is ever desired, it would be created from `[thud]` many more sytem package version updates added.
- Finalize commit messages (and contents).

# After first PR
- Abort if ROS_DISTRO not in ROS_DISTRO_COMPAT
- When updating meta-webosose: specify v2 of meta-ros; remove from "base" weboslayers.py; conditionalize LAYERDEPS; add ros-core to webos-extended, not pg-ros2-world
- ROS "over" webOS OSE.
- Get **melodic** `core-image-ros-roscore` to build:
    - Migrate `catkin`, `catbin-runtime` from `v1-recipes-ros1`.
    - Is the `/etc/hosts` setting shown on <https://github.com/bmwcarit/meta-ros/blob/master/README.md> still needed (for ROS 1)?
- Upgrade the recipes included in `meta-ros` for the system packages needed for `core-image-ros-world` with all
  `DISTRO_FEATURES` enabled for **melodic** to the versions found in Ubuntu 18.04 .
    - Fix log4cxx v0.10.0-13: apply patches from log4cxx_0.10.0-13ubuntu2.debian.tar.xz:/debian/patches; add ubuntu* to PV?
- Enable `DISTRO_FEATURES` and get to build:
    - ros-qt
    - ros-behaviortree-cpp-v3 (disable in ros-distro.inc)
    - ros-gazebo
    - ros-mrpt + opengl: building of new versions of wxwidgets and wxpython has not been done
    - ros-realsense
    - ros-rviz
    - ros-rqt
- Add new recipes to meta-ros for these later (when enabling various `DISTRO_FEATURES`):
    - bullet navigation2/nav2-map-server_0.1.7.bb
    - clang-format ament-lint/ament-clang-format_0.6.4.bb
    - libgazebo9 gazebo-ros-pkgs/gazebo-rosdev_3.2.0.bb
    - suitesparse mrpt2/mrpt2_1.9.9.bb
    - tango-icon-theme qt-gui-core/qt-gui_1.0.4.bb
- Simplify get_python_soabi(d) in ament.bbclass (use TUNE_ARCH?)
- ROS_EXEC_DEPENDS: Remove any packages with .so-s as OpenEmbedded will automatically add the dependency on the packages that
  contain them (see, eg, behaviortree-cpp-v3-3.0.4.inc).
- Github tarballs hashes can change: https://github.com/keybase/client/issues/10800#issuecomment-377417315. What about Debian server (used for log4cxx)?
- HK: Get **bouncy** core-image-roscore to build: backport **crystal** .inc-s.
    - Convert BBCLASSEXTENDS in recipes to append to list in conf file.
- superflore_generated.bbclass: if `native` in `BBCLASSEXTEND` => append `-native` to items in `DEPENDS`, `RDEPENDS`.
- Submit PR to have console-bridge-vendor use v0.4.2 .
- **melodic** platform packages to upgrade (or downgrade):

        collada-dom 2.40 2.4.4 [melodic]
        festival 2.3 2.5.0 [melodic]
        fcl 0.3.2 0.5.0 [melodic]
        libccd 1.5.0 2.0 [melodic]
        geographiclib 1.48 1.49 [melodic]
        graphviz 2.40.1 2.40.1 [melodic]
        libfreenect 0.5.2 0.5.3 [melodic]
        python-netifaces 0.10.5 0.10.4 [melodic]
        python-paramiko 1.16.0 2.0.0 [melodic]
        python-bson 0.4.3 3.6.1 [melodic]
        python-defusedxml 0.5.0 0.5.0  [melodic]
        python-empy 3.3.2 3.3.2 [melodic]
        libqhull: qhull 2012.1 2015.2 [melodic]
        wxpython 3.0.2.0 3.0.2.0  [melodic]

- webosose/build-webos PR to remove meta-*-ros2?

# New ROS_DISTRO bringup
- Compare system packages
    - Add mapping for new ones
    - Add recipes if necessary.
- Migrate .inc files
  - `find includes-* -name '*.inc' | grep '[.][0-9]*[.]' | LC_ALL=C sort -t / -k 2,2`
  - Compare `ROS_SUPERFLORE_GENERATED_RECIPE_BASENAMES`.
  - Compare dependency changes by diffing `cache-diffame.yaml`.

        DONE includes-ros2/ament-cmake/ament-cmake-0.6.1.inc
        DEFER includes-ros2/apriltag2-node/apriltag2-node-1.0.1.inc
        DEFER includes-ros1/behaviortree-cpp/behaviortree-cpp-2.4.3-1.inc
        DEFER includes-ros1/behaviotree-cpp-v3/behaviortree-cpp-v3-3.0.4.inc
        DONE includes-ros2/common-interfaces/std-srvs-0.6.1.inc
        DONE includes-ros2/demos/pendulum-msgs-0.6.2.inc
        TRY-WITHOUT includes-ros2/fmi-adapter-ros2/fmi-adapter-0.1.3.inc
        DEFER includes-ros1/image-pipeline/image-publisher-2.0.0.inc
        DEFER includes-ros2/keystroke/keystroke-0.3.0-1.inc
        TRY-WITHOUT includes-ros2/launch/launch-0.7.4.inc
        FIXED includes-ros2/message-filters/message-filters-3.0.0_common.inc
        DEFER includes-ros2/micro-ros-agent/micro-ros-agent-0.0.1-2.inc
        DEFER includes-ros2/micro-xrce-dds-agent/micro-xrce-dds-agent-1.0.3-1.inc
        DEFER includes-ros1/ml-classifiers/ml-classifiers-1.0.1-1.inc
        DEFER includes-ros2/navigation2/dwb-msgs-0.1.7.inc
        DEFER includes-ros2/navigation2/nav-2d-msgs-0.1.7.inc
        DEFER includes-ros2/navigation2/nav2-amcl-0.1.7.inc
        DEFER includes-ros2/navigation2/nav2-costmap-2d-0.1.7.inc
        DEFER includes-ros2/navigation2/nav2-map-server-0.1.7.inc
        DEFER includes-ros2/navigation2/nav2-msgs-0.1.7.inc
        DONE includes-ros1/orocos-kinematics-dynamics/orocos-kdl-3.1.0.inc
        DONE includes-ros2/osrf-testing-tools-cpp/osrf-testing-tools-cpp-1.1.0_common.inc
        DONE includes-ros2/osrf-testing-tools-cpp/test-osrf-testing-tools-cpp-1.1.0.inc
        DEFER includes-ros2/py-trees-ros-interfaces/py-trees-ros-interfaces-1.1.1-1.inc
        WIP includes-ros1/qt-gui-core/qt-gui-1.0.4.inc
        WIP includes-ros1/qt-gui-core/qt-gui-cpp-1.0.4.inc
        DONE includes-ros2/rcl-interfaces/builtin-interfaces-0.6.3.inc
        DONE includes-ros2/rcl-interfaces/lifecycle-msgs-0.6.3.inc
        DONE includes-ros2/rcl-interfaces/rcl-interfaces-0.6.3_common.inc
        DONE includes-ros2/rclcpp/rclcpp-0.6.4.inc
        DONE includes-ros2/rmw-fastrtps/rmw-fastrtps-shared-cpp-0.6.2.inc
        DONE includes-ros2/ros-workspace/ros-workspace-0.6.1.inc
        DEFER includes-ros2/ros2-object-analytics/object-analytics-msgs-0.5.3.inc
        DONE includes-ros2/ros2cli/ros2cli-0.6.3.inc
        DEFER includes-ros2/rosbag2/ros1-rosbag-storage-vendor-0.0.7.inc
        DONE includes-ros2/rosbag2/rosbag2-tests-0.0.7.inc
        TRY-WITHOUT includes-ros2/rosbag2/rosbag2-transport-0.0.7.inc
        DONE includes-ros2/rosidl/rosidl-0.6.3_common.inc
        DONE includes-ros2/rosidl/rosidl-adapter-0.6.3.inc
        DONE includes-ros2/rosidl-typesupport-fastrtps/rosidl-typesupport-fastrtps-c-0.6.1.inc
        DONE includes-ros2/rosidl-typesupport-fastrtps/rosidl-typesupport-fastrtps-cpp-0.6.1.inc
        DONE includes-ros2/sros2/sros2-0.6.3.inc
        DONE includes-ros2/sros2/sros2-cmake-0.6.3.inc
        DEFER includes-ros2/system-modes/system-modes-0.1.2.inc
        DONE includes-ros1/teleop-twist-keyboard/teleop-twist-keyboard-2.2.0.inc
        DONE includes-ros2/uncrustify-vendor/uncrustify-vendor-1.1.0.inc
        DONE includes-ros2/unique-identifier-msgs/unique-identifier-msgs-2.0.0.inc
        DONE includes-ros2/urdfdom/urdfdom-2.1.0.inc
        DONE includes-ros1/vision-opencv/cv-bridge-2.1.0.inc

    - Create per-ROS_DISTRO files:

        DRAFT Add include/<ROS_DISTRO>/ros-distro.inc
        DRAFT Add ros_distro_<ROS_DISTRO>.bbclass
        DRAFT Add include/<ROS_DISTRO>/ros-{recipe-blacklist,preferred-versions}.inc
        DRAFT Add include/<ROS_DISTRO>/ros-preferred-providers.inc

### XXX DROP OR  MOVE TO BE AFTER #4? Milestone 7: All non-optional packages on `qemux86` and `raspberrypi3` (ROS 2 **dashing** and **thud**-based webOS OSE)
- Use the pre-release `weboslayers.py` for the **thud**-based webOS OSE  from <http://gpro.lge.com/#/c/219026/> XXX
  to create manual instructions for setting up a build tree.
- Make whatever fixes are necessary to have **crystal** and webOS OSE use the same system component versions.
    - None are necessary.
- Done when the `qemux86` and `raspberrypi3` images boot webOS OSE and can perform these basic ROS actions:

  ``` text
    # ros2 topic list
    /parameter_events
    /rosout

    # ros2 topic pub /chatter std_msgs/String "data: Hello world"
    publisher: beginning loop
    publishing #1: std_msgs.msg.String(data='Hello world')
    publishing #2: std_msgs.msg.String(data='Hello world')
    ^C
    # ros2 topic echo /chatter
    data: Hello world
    data: Hello world
  ```

### XXX DROP? Milestone 8: All packages on `qemux86` and `raspberrypi3` (ROS 2 **dashing** and OE-Core **warrior** OR  **warrior**-based webOS OSE)
- Create new branch `[warrior-superflore-dashing]` from `[thud-superflore-dashing]` of <https://github.com/lgsvl/meta-ros2>.
- Fetch `bitbake.git` from the head of its `[1.42]` branch and `openembedded-core.git` from the HEAD of its `[warrior]` branch.
  Add `BBLAYERS_FETCH_DIR = "${COREBASE}/.."` to `conf/bblayers.conf` then
  `bitbake-layers layerindex-fetch -b warrior LAYERNAME` to fetch the other layers upon which `meta-ros` depends.
- Use `bitbake-layers show-overlayed` to find bbclass-s and recipes for system packages in `meta-ros` that are no longer needed
  because they are now provided by OE-Core **warrior**.
- Add `warrior` to `LAYERSERIES_COMPAT_ros-layer`.
- Document what was done as a **How to Support a New OE Release** wiki page associated with the **superflore** repo.
- Done when `core-image-ros-world` builds successfully for `qemux86` and `raspberrypi3` with all `DISTRO_FEATURES` enabled.
- Submit a PR to merge `[warrior-superflore-dashing]` branch into `[warrior]` of <https://github.com/ros/meta-ros>.

### ROS Workspace
  - Additions to environment (Ubuntu 18.04 ros-crystal-ros-base)

        AMENT_PREFIX_PATH=/opt/ros/crystal
        COLCON_PREFIX_PATH=/opt/ros/crystal
        LD_LIBRARY_PATH=/opt/ros/crystal/lib
        PATH=/opt/ros/crystal/bin:$PATH
        PYTHONPATH=/opt/ros/crystal/lib/python3.6/site-packages:$PYTHONPATH
        ROS_DISTRO=crystal
        ROS_PYTHON_VERSION=3
        ROS_VERSION=2

  - Additions to environment (Ubuntu 18.04 ros-crystal-desktop)

        AMENT_PREFIX_PATH=/opt/ros/crystal
        COLCON_PREFIX_PATH=/opt/ros/crystal
        LD_LIBRARY_PATH=/opt/ros/crystal/opt/yaml_cpp_vendor/lib:/opt/ros/crystal/opt/rviz_ogre_vendor/lib:/opt/ros/crystal/lib
        PATH=/opt/ros/crystal/bin:$PATH
        PYTHONPATH=/opt/ros/crystal/lib/python3.6/site-packages:$PYTHONPATH
        ROS_DISTRO=crystal
        ROS_PYTHON_VERSION=3
        ROS_VERSION=2

  - Additions to environment (Ubuntu 18.04 ros-melodic-desktop-full)

      CMAKE_PREFIX_PATH=/opt/ros/melodic
      LD_LIBRARY_PATH=/opt/ros/melodic/lib
      PATH=/opt/ros/crystal/bin:$PATH
      PKG_CONFIG_PATH=/opt/ros/melodic/lib/pkgconfig
      PYTHONPATH=/opt/ros/melodic/lib/python2.7/dist-packages:$PYTHONPATH
      ROS_DISTRO=melodic
      ROS_ETC_DIR=/opt/ros/melodic/etc/ros
      ROSLISP_PACKAGE_DIRECTORIES=
      ROS_MASTER_URI=http://localhost:11311
      ROS_PACKAGE_PATH=/opt/ros/melodic/share
      ROS_PYTHON_VERSION=2
      ROS_ROOT=/opt/ros/melodic/share/ros
      ROS_VERSION=1



sed -n -e '/\[\]$/ p' -e '/:$/ {;N;s/\n-//p;}' crystal/rosdep-resolve.yaml melodic/rosdep-resolve.yaml | sort -u | sed -e "/'null'/ d" -e '/\[\]/d' -e 's/@.*$//' | awk -F : '{print $2}' | sed -e 's/^ //' -e 's/\${PYTHON_PN}/python3/' | sort -u > ~/z/tmp/crystal+melodic-platform-mappings.list

-------------

	new file:   generated-recipes-dashing/depthimage-to-laserscan/depthimage-to-laserscan_2.2.1-1.bb
	new file:   generated-recipes-dashing/fmi-adapter-ros2/fmi-adapter-examples_0.1.5-1.bb
	new file:   generated-recipes-dashing/fmi-adapter-ros2/fmi-adapter_0.1.5-1.bb
	new file:   generated-recipes-dashing/gazebo-ros-pkgs/gazebo-msgs_3.3.0-1.bb
	new file:   generated-recipes-dashing/gazebo-ros-pkgs/gazebo-plugins_3.3.0-1.bb
	new file:   generated-recipes-dashing/gazebo-ros-pkgs/gazebo-ros-pkgs_3.3.0-1.bb
	new file:   generated-recipes-dashing/gazebo-ros-pkgs/gazebo-ros_3.3.0-1.bb
	new file:   generated-recipes-dashing/gazebo-ros-pkgs/gazebo-rosdev_3.3.0-1.bb
	renamed:    generated-recipes-dashing/geometry2/tf2-eigen_0.11.2-1.bb -> generated-recipes-dashing/geometry2/tf2-eigen_0.11.3-1.bb
	renamed:    generated-recipes-dashing/geometry2/tf2-geometry-msgs_0.11.2-1.bb -> generated-recipes-dashing/geometry2/tf2-geometry-msgs_0.11.3-1.bb
	renamed:    generated-recipes-dashing/geometry2/tf2-msgs_0.11.2-1.bb -> generated-recipes-dashing/geometry2/tf2-msgs_0.11.3-1.bb
	renamed:    generated-recipes-dashing/geometry2/tf2-ros_0.11.2-1.bb -> generated-recipes-dashing/geometry2/tf2-ros_0.11.3-1.bb
	renamed:    generated-recipes-dashing/geometry2/tf2-sensor-msgs_0.11.2-1.bb -> generated-recipes-dashing/geometry2/tf2-sensor-msgs_0.11.3-1.bb
	renamed:    generated-recipes-dashing/geometry2/tf2_0.11.2-1.bb -> generated-recipes-dashing/geometry2/tf2_0.11.3-1.bb
	new file:   generated-recipes-dashing/rmw-connext/rmw-connext-cpp_0.7.2-1.bb
	new file:   generated-recipes-dashing/rmw-connext/rmw-connext-shared-cpp_0.7.2-1.bb
	modified:   generated-recipes-dashing/rmw-implementation/rmw-implementation_0.7.1-1.bb
	new file:   generated-recipes-dashing/rmw-opensplice/rmw-opensplice-cpp_0.7.1-1.bb
	new file:   generated-recipes-dashing/ros2-intel-realsense/realsense-camera-msgs_2.0.3-2.bb
	new file:   generated-recipes-dashing/ros2-intel-realsense/realsense-ros2-camera_2.0.3-2.bb
	new file:   generated-recipes-dashing/ros2-object-analytics/object-analytics-msgs_0.5.4-1.bb
	new file:   generated-recipes-dashing/ros2-object-analytics/object-analytics-node_0.5.4-1.bb
	new file:   generated-recipes-dashing/ros2-object-analytics/object-analytics-rviz_0.5.4-1.bb
	new file:   generated-recipes-dashing/rosidl-typesupport-connext/connext-cmake-module_0.7.1-1.bb
	new file:   generated-recipes-dashing/rosidl-typesupport-connext/rosidl-typesupport-connext-c_0.7.1-1.bb
	new file:   generated-recipes-dashing/rosidl-typesupport-connext/rosidl-typesupport-connext-cpp_0.7.1-1.bb
	new file:   generated-recipes-dashing/rosidl-typesupport-opensplice/opensplice-cmake-module_0.7.1-1.bb
	new file:   generated-recipes-dashing/rosidl-typesupport-opensplice/rosidl-typesupport-opensplice-c_0.7.1-1.bb
	new file:   generated-recipes-dashing/rosidl-typesupport-opensplice/rosidl-typesupport-opensplice-cpp_0.7.1-1.bb
	modified:   generated-recipes-dashing/rosidl-typesupport/rosidl-typesupport-c_0.7.1-1.bb
	modified:   generated-recipes-dashing/rosidl-typesupport/rosidl-typesupport-cpp_0.7.1-1.bb
	new file:   generated-recipes-dashing/variants/desktop_0.7.0-1.bb
	new file:   generated-recipes-dashing/variants/ros-base_0.7.0-1.bb
	new file:   generated-recipes-dashing/variants/ros-core_0.7.0-1.bb
	renamed:    generated-recipes-dashing/behaviortree-cpp-v3/behaviortree-cpp-v3_3.0.8-1.bb -> generated-recipes-dashing/behaviortree-cpp-v3/behaviortree-cpp-v3_3.0.9-1.bb
	new file:   generated-recipes-dashing/behaviortree-cpp/behaviortree-cpp_2.5.2-1.bb crystal has 2.4.3
